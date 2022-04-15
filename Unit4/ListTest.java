public class ListTest {
    public static void main(String[] args){
        List<Double> lst = new ArrayList<Double>();
        lst.append(9.54);
        lst.append(87.3);
        lst.append(55.1);
        System.out.println(lst.get(1));  // 87.3
        lst.insert(1, 12.54);
        System.out.println(lst.get(1));  // 12.54
        System.out.println(lst.get(3));  // 55.1
        lst.set(3, 19.2);
        System.out.println(lst.get(3));  // 19.2
        System.out.println(lst.remove(0)); // 9.54
        System.out.println(lst.get(2));  // 19.2

        for(Double d: lst)
            System.out.println(d);
    }
}
