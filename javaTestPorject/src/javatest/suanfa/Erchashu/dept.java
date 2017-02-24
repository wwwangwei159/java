package javatest.suanfa.Erchashu;

import java.util.*;

public class dept {
	
	//二叉树的高度,后续遍历例子
	int height(TreeNode T)
	{
	  if (T==null) {
		  return 0;
	  }
	  int l=height(T.getLeftChild());
	  int r=height(T.getRightChild());
	  System.out.println("l==="+l+"---r=="+r+"------T==="+T.val);
	  if (l>r) {
	    return (l+1);
	  }
	  return (r+1);
	}
	
	/**
	 * 二叉树的queue层次优先遍历
	 * @param T
	 */
	public void cengci(TreeNode T)
	{
	  if (T==null) {
		  return;
	  }
	  LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	  queue.offer(T);
	  while(!queue.isEmpty()){
		  TreeNode node = queue.poll();
		  System.out.println("---queue--"+node.getVal());
		  if(node.getLeftChild()!=null){
			  queue.offer(node.getLeftChild());
		  }
		  if(node.getRightChild()!=null){
			  queue.offer(node.getRightChild());
		  }
		  
	  }
	}
	
	/**
	 * 二叉树的先序遍历方法
	 * @param T
	 */
	public void stack(TreeNode T)
		{
		  if (T==null) {
			  return;
		  }
		  LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		  stack.push(T);
		  while(!stack.isEmpty()){
			  TreeNode node = stack.pop();
			  System.out.println("---stack--"+node.getVal());
			  if(node.getRightChild()!=null){
				  stack.push(node.getRightChild());
			  }
			  if(node.getLeftChild()!=null){
				  stack.push(node.getLeftChild());
			  }
			  
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node = new TreeNode(1);
		TreeNode node21 = new TreeNode(21);
		TreeNode node22 = new TreeNode(22);
		TreeNode node31 = new TreeNode(31);
		TreeNode node32 = new TreeNode(32);
		TreeNode node33 = new TreeNode(33);
		TreeNode node43 = new TreeNode(43);
		TreeNode node44 = new TreeNode(44);
		node.setLeftChild(node21);
		node.setRightChild(node22);
		node21.setLeftChild(node31);
		node21.setRightChild(node32);
		node22.setRightChild(node33);
		node33.setLeftChild(node43);
		node33.setRightChild(node44);
		dept dp = new dept();
		//求二叉树的高度
		System.out.println(dp.height(node));
		//深度遍历
		dp.cengci(node);
		dp.stack(node);
		
	}

}
