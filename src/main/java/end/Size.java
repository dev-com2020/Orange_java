package end;

enum Size {
    SMALL("Mały"),
    MEDIUM("Średni"),
    LARGE("Duży"),
    XLARGE("b.duży");


    private final String desc;

    private Size(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }

    public static Size fromDesc(String desc){
        Size[] values = values();
        for (Size size: values){
            if (size.getDesc().equals(desc))
                return size;
        }
        return null;
    }
}
