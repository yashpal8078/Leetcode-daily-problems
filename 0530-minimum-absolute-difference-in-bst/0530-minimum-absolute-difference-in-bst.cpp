/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void helper(TreeNode*root,int&ans,vector<int>&vec){//It is highly prefered to use helper function than using global variables inside class
        if(root==NULL)return;

        helper(root->left,ans,vec);
        if(!vec.empty())ans=min(root->val-vec.back(),ans);
        
        vec.push_back(root->val);
        helper(root->right,ans,vec);
    }
    int getMinimumDifference(TreeNode* root) {
         vector<int>vec;
        int ans=INT_MAX;
        helper(root,ans,vec);
        return ans;
    }
};