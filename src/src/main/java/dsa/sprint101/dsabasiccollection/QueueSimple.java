package dsa.sprint101.dsabasiccollection;

import java.util.LinkedList;
import java.util.Queue;

/*
Problem Description
A queue is a data structure that follows the First In First Out principle (FIFO). That is, an element inserted into the queue first, can be retrieved first.
In this problem, you will perform some operations on queue.
There are Q queries. Each query can be of two types -
Insert an element into the queue.
Remove the first element of the queue and return it.
Note that you are not expected to create a queue from scratch, but use the queue data structure and its accompanying methods. Also, there will be no scenario to remove from an empty queue.

Input format
There are Q+1 lines of input
First line contains Q, number of queries.
Next Q lines will contain either of the following -
1 X - insert X in the queue.
2 - remove the first element of the queue and return it.

Output format
For each query of the second type print the first element.

Sample Input 1
5
1 3
1 2
2
1 1
2

Sample Output 1
3
2

Constraints
1 <= Q <= 100
-10^5 <= X <= 10^5
 */
public class QueueSimple {

    Queue<Integer> q = new LinkedList<>();
    public void insert(int element) {
        q.add(element);
    }

    public int getFirst() {
        int num = q.poll();
        return num;
    }
}
