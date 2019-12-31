import java.util.Stack;

public class NextGreater {
	public static void NextGreaterElement(int[] input) {
		  if(input.length == 0) {
		    return;
		  }
		  Stack<Integer> s = new Stack<>();
		  s.push(input[0]);
		  for(int i=1;i<input.length;i++) {
		    int next = input[i];
		    int current = s.peek();
		    if(current < next) {
		      System.out.println(current + " "+ next);
		      s.pop();
		    }
		    s.push(next);
		  }
		  while(!s.isEmpty()) {
		    System.out.println(s.peek() + " " + -1);
		    s.pop();
		  }
		}


	public static void main(String[] args) {
		int[] input = new int[] {11,13,21,3};
		NextGreaterElement(input);

	}

}
