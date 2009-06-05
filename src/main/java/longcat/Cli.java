package longcat;

public class Cli {
    public static void main(String[] args) {
        System.out.print(build().parseArguments(args));
    }

    private static CliArgumentParser build() {
        LongcatFactory factory = new LongcatFactoryImpl();
        return new CliArgumentParser(factory);
    }
}
