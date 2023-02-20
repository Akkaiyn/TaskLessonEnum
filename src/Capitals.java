public enum Capitals {
    BISHKEK("Our Capital"),
    TOKYO("Biggest megapolis"),
    BERLIN("Green"),
    ASTANA("Brothers' capital "),
    MOSKVA("a lot of kyrgyz except Bisgkek");

    private String different;

    Capitals(String different) {
        this.different = different;
    }

    public String getDifferent() {
        return different;
    }
}
