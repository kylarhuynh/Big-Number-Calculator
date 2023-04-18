public class Calculations {

    public static LinkedList Addition(LinkedList l1, LinkedList l2){
        LinkedList res = new LinkedList();
        int carry = 0;
        int v1 = 0;
        int v2 = 0;
        Node current1 = l1.getHead();
        Node current2 = l2.getHead();
        while (current1 != null || current2 != null || carry != 0){
            if (current1 != null)
                v1 = current1.getVal();
            else {
                v1 = 0;
            }
            if (current2 != null)
                v2 = current2.getVal();
            else {
                v2 = 0;
            }
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            res.add(sum);

            if (current1 != null)
                current1 = current1.getNext();
            if (current2 != null)
                current2 = current2.getNext();
        }
        return res;
    }

    public static LinkedList Multiplication(LinkedList l1, LinkedList l2) {
        LinkedList res = new LinkedList();
        Node place2 = l2.getHead();

        int i = 0;
        while (place2 != null){
            int carry = 0;
            Node place1 = l1.getHead();
            LinkedList l3 = new LinkedList();

            for (int j = 0; j < i ; j++) {
                l3.add(0);
            }
            int val = 0;
            while (place1 != null || carry != 0){
                if (place1 != null)
                    val = place1.getVal();
                else {
                    val = 0;
                }
                int digit = val * place2.getVal() + carry;
                carry = digit / 10;
                digit = digit % 10;
                l3.add(digit);

                if (place1 != null)
                    place1 = place1.getNext();
            }
            place2 = place2.getNext();
            i++;
            res = Addition(res, l3);
        }
        return res;
    }

    public static LinkedList Exponentiation(LinkedList l1, LinkedList l2){
        // base case = 0
        if (l2.reverse().replaceFirst("^0+(?!$)", "").equals("0")){
            LinkedList one = new LinkedList();
            one.add(1);
            return one;
        }
        if (l2.reverse().replaceFirst("^0+(?!$)", "").equals("1")){
            return l1;
        }

        LinkedList res = Calculations.Multiplication(l1, l1);
        LinkedList squared = Calculations.Multiplication(l1, l1);
        if (l2.isOdd()){
           int exponent = (Integer.parseInt(l2.reverse()) - 1) / 2;
           for (int i = 1 ; i < exponent ; i++){
               res = Calculations.Multiplication(res, squared);
           }
           return Calculations.Multiplication(l1, res);
        }
        else {
            int exponent = (Integer.parseInt(l2.reverse())) / 2;
            for (int i = 1 ; i < exponent ; i++){
                res = Calculations.Multiplication(res, squared);
            }
            return res;
        }
    }
}
