package lesson4.task1;

public class Program {
    public static void main(String[] args) {
        FactoreProvider factoreProvider = new FactoreProvider();
        DealerProvider dealerProvider = new DealerProvider(factoreProvider);

        try {
            ComponentInfo componentInfo = dealerProvider.getComponent(900003);
            if (componentInfo != null){
                System.out.println(componentInfo);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
