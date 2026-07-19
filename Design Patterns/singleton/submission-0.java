static class Singleton {

    private String value = null;

    private Static uniqueInstance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        else{
            return uniqueInstance;
        }
        return uniqueInstance;

    }

    public String getValue() {
        return this.value;

    }

    public void setValue(String value) {
        value = this.value;

    }
    
}
