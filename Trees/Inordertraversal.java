class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

         Inorder(root  , ans );
         return ans;
        }
    

        public void Inorder(TreeNode node , List<Integer> ans){

            // base case
            if(node == null){
                return;
            }

            Inorder(node.left , ans);
            // ans mai add kro

            ans.add(node.val);

            // right
            Inorder(node.right , ans);


        }

        
    
}
