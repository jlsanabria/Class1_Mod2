public class Main {
    private static byte xPrimitivo;

    public static void main(String[] args) {
        byte xPrimitivo = 127;
        Byte xByteObjeto = 125;
        System.out.println(xPrimitivo);
        System.out.println(xByteObjeto.byteValue());

        short sPrimitivo = 32767;
        Short sObjeto = (short) xPrimitivo;
        System.out.println(sPrimitivo);
        System.out.println(sObjeto);

        int iPrimitivo = 34567812;
        Integer iObjeto = 126834;
        System.out.println(iPrimitivo);
        System.out.println(iObjeto.doubleValue());

        long lPrimitivo = 9876543210L;
        Long lObjeto = 9876543210L;
        System.out.println(lPrimitivo);
        System.out.println(lObjeto);

        float fPrimitivo = 3.14f;
        Float fObjeto = 3.14f;
        System.out.println(fPrimitivo);
        System.out.println(Float.isFinite(fObjeto));

        double dPrimitivo = 3.14;
        Double dObjeto = 3.14;
        System.out.println(dPrimitivo);
        System.out.println(dObjeto.byteValue());

        char cPrimitivo = 'a';
        Character cObjeto = 'a';
        System.out.println(cPrimitivo);
        System.out.println(Character.isUpperCase(cPrimitivo));

        boolean bPrimitivo = true;
        Boolean bObjeto = false;
        System.out.println(bPrimitivo);
        System.out.println(Boolean.TRUE);



    }
}