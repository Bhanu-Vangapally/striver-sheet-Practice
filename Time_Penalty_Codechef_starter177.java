/* Time Penalty
Unlike a usual CodeChef Starters contest, Starters 173 has a time penalty for every wrong submission.

You are participating in CodeChef Starters 173, which has a time penalty of 
10
10 minutes for every incorrect submission you make.
That is, the total penalty for a problem equals the number of minutes from the start of the contest till your submission receives the AC verdict, plus 
10
10 minutes for every incorrect submission made before that.

You solved a problem 
X
X minutes after the start of the contest, and made 
Y
Y incorrect submissions while doing so.
What's the total time penalty for this problem?

Input Format
The first and only line of input will contain two space-separated integers 
X
X and 
Y
Y — the number of minutes after which you solved the problem, and the number of wrong submissions you made.
Output Format
Output a single integer: the total time penalty for the problem.

Constraints
1
≤
X
≤
150
1≤X≤150
0
≤
Y
≤
10
0≤Y≤10
Sample 1:
Input
Output
3 2
23
Explanation:
The problem was solved 
3
3 minutes after the start of the contest, with 
2
2 incorrect submissions.
Since each incorrect submission adds 
10
10 minutes to the penalty, the total penalty equals 
3
+
2
×
10
=
23
3+2×10=23.

Sample 2:
Input
Output
58 0
58
Explanation:
The problem was solved 
58
58 minutes after the start of the contest, with 
0
0 incorrect submissions.
So, the total time penalty is just 
58
58.

accepted
Accepted
3617
total-Submissions
Submissions
4497
accuracy
Accuracy
96.06
Did you like the problem statement?
51 users found this helpful
More Info
Time limit1 secs
Memory limit1.5 GB
Source Limit50000 Bytes
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt();
        System.out.println(a+b*10);
	}
}

