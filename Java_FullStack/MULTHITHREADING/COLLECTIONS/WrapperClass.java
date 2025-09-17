 class WrapperClass{

    public static void main (String[] args){
        //  Integer  i = new Integer(20);// it is not good practice after java 9.

        Integer i = Integer.valueOf(20);//wraper object.
        Integer i2 = Integer.valueOf("123");

        System.out.println(i);
        System.out.println(i2);
        int obj  = Integer.parseInt("2233");
        System.out.println(obj);

        Double d = 9.899;
        int dd = d.intValue();
        System.out.println(dd);

        Integer  ii = 88;

        String s =  ii.toString();
        System.out.println(s);

        Integer c = 1000;
        Integer e = 1000;
        System.out.println(c==e);
    }
}