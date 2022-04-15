public class BinaryNode {
    
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public String infexTraversal(){
        String str = "";
        if(left != null)
            str = str + left.infexTraversal();
        str = str + value + " ";
        if(right != null)
            str = str + right.infexTraversal(); 
        return str;       
    }

    public boolean search(int target){
        if(value == target) 
            return true;
        if(left!=null && left.search(target))
            return true;
        if(right!=null && right.search(target))
            return true;
        return false;            
    }

    public void binaryInsert(int value){
        if(value < this.value){
            if(left!=null)
                left.binaryInsert(value);
            else
                left = new BinaryNode(value);    
        }else{
            if(right!=null)
                right.binaryInsert(value);
            else
                right = new BinaryNode(value);    
        }
    }

    public boolean binarySearch(int value){
        if(value == this.value)
           return true;
        else if(value < this.value){
            if(left==null)
                return false;
            else
                return left.binarySearch(value);     
        } else{
            if(right==null)
                return false;
            else
                return right.binarySearch(value);  
        }  
    }
}
