class NodeDetails {
  int data;
  int min;
  int max;
  public NodeDetails(int data,int min,int max) {
    this.data = data;
    this.min = min;
    this.max = max;
  }
}
public boolean levelOrderIsOfBST(int[] a, int n) {
  if(n==0) {
    return true;
  }
  Queue<NodeDetails> q = new LinkedList<>();
  q.push(new NodeDetails(a[0],Integer.MIN_VALUE, Integer.MAX_VALUE);
  int i=1;
  while(i<n && q.size() >0) {
    NodeDetails temp = q.peek();
    q.pop();

    if(i<n && temp.data > a[i] && temp.max > a[i]) {
      q.push(new NodeDetails(a[i],temp.min, temp.data));
      i++;
    }
    if(i<n && temp.data < a[i] && temp.min < a[i]) {
      q.push(new NodeDetails(a[i], temp.data, temp.max);
      i++;
    }   
  }
  if(i==n) {
    return true;
  }
  return false;
}

