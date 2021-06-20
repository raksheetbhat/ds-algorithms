import java.util.Stack;

public class ReverseWord {
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder(100_000);
		int i=0;
		while(i<100_000){
			input.append(i+"_");
		}
		String w = input.toString();
		StringBuilder res = new StringBuilder(w.length());

		Stack<Character> s = new Stack<>();
		
		while(i<w.length()) {
			s.push(w.charAt(i));
			i++;
		}

		while(!s.empty()){
			res.append(s.pop());
		}

		//System.out.println(res);
	}
}