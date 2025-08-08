class Solution {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> l=new ArrayList<Integer>();
        pre(root,l);
        return l;
    }
    public void pre(Node r,ArrayList<Integer> l){
        if(r!=null) l.add(r.data);
        if(r.left!=null) pre(r.left,l);
        if(r.right!=null) pre(r.right,l);
    }
}