package weeks11;

public enum Season {

    SPRING("봄"){
        @Override
        void describeSeaon() {
            System.out.println("봄은 따듯합니다.");
        }
    }, SUMMER("여름"){
        @Override
        void describeSeaon() {
            System.out.println("여름은 뜨겁습니다.");
        }
    }, FALL("가을"){
        @Override
        void describeSeaon() {
            System.out.println("가을은 서늘합니다.");
        }
    }, WINTER("겨울"){
        @Override
        void describeSeaon() {
            System.out.println("겨울은 춥습니다.");
        }
    };

    private String description;
    Season(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

    abstract void describeSeaon();


}
