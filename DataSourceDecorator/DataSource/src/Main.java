public class Main {
    public static void main(String[] args) {

        DataSource ds =
                new CompressDecorator(
                        new EncryptionDecorator(
                                new StorageDataSource()
                        )
                );

        ds.Write("Salut! Asta este o testare Decorator.");
        System.out.println("Read result: " + ds.Read());
    }
}
