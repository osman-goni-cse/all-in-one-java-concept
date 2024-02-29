package GenericsTutorial;

class Generic<T> {
    private T obj;

    Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Type is " + obj.getClass().getName() + " and value: " + obj);
    }
}