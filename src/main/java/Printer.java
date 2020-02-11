public class Printer {
    private Integer paper;
    private Integer tonerVolume;

    public Printer(){
        this.paper = 0;
        this.tonerVolume = 0;
    }

    public Integer getPaper(){
        return this.paper;
    }

    public void addPaper(Integer pages){
        this.paper += pages;
    }

    public Integer getTonerVolume() {
        return this.tonerVolume;
    }

    public void addTonerVolume(Integer tonerVolume) {
        this.tonerVolume += tonerVolume;
    }

    public void print(Integer pages, Integer copies){
        Integer totalPages = pages * copies;
        if ( this.paper >= totalPages && this.tonerVolume >= totalPages){
            this.paper -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

}
