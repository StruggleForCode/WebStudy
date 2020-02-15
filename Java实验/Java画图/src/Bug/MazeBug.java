package Bug;

import gridworld.actor.Actor;
import gridworld.actor.Bug;
import gridworld.actor.Flower;
import gridworld.grid.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

import javax.swing.JOptionPane;

/*
 * Low:   534 1175 350 973 1052
 * Smart: 552 761 330 175 420
 */

/*
 * �ڵ㣺�洢����͸÷������ߵĴ���
 * ��һ������ǰ�����1���������1
 */
class Node {
	private int dir;   // ���򣬽Ƕ�ֵ
	private int ct;    // �÷������ߴ���

	public Node(int initdir, int initct) {
		dir = initdir;
		ct = initct;
	}

	public int getDir() {
		return dir;
	}

	public int getCt() {
		return ct;
	}

	public void setCt(int deta) {
		ct += deta;
	}
}

// ��������㷨���Թ���������С�׳����ʽ����
public class MazeBug extends Bug {
	private Location next;             // ��һ��Ҫ�ߵĸ���
	private Integer stepCount = 0;     // ���ߵĲ���
	private boolean isEnd = false;     // �Ƿ񵽴��Թ�����
	private boolean hasShown = false;  // �Ƿ���ʾ�˽�����Ϣ
	private Stack<Location> path = new Stack<>(); // �洢�߹���·��
	private ArrayList<Node> arr = new ArrayList<>();

	public MazeBug() {
		setColor(Color.GREEN);
		arr.add(new Node(0, 0));
		arr.add(new Node(90, 0));
		arr.add(new Node(270, 0));
		arr.add(new Node(180, 0));
	}

	// ������ִ��
	public void act() {
		boolean willMove = canMove();   // �Ƿ��ܼ����ƶ�

		if (isEnd) {  // �Ƿ����
			if (!hasShown) { // �Ƿ���ʾ������Ϣ
				String msg = stepCount.toString() + " steps";
				JOptionPane.showMessageDialog(null, msg);
				hasShown = true;
			}
			return;
		} else if (willMove) { // ��ǰ�ƶ�һ����������1
			move();
			++stepCount;
		} else { // �����ƶ�������һ�������÷���ļ�������1
			Grid<Actor> grid = getGrid();
			Location loc = this.getLocation();
			Location top = path.pop();
			++stepCount;
			grid.remove(top);
			this.setDirection(loc.getDirectionToward(top));
			this.moveTo(top);
      // ���߹�����·����һ��׻�
			Flower flower = new Flower(Color.WHITE);
			flower.putSelfInGrid(getGrid(), loc);

			// �����������1
			int dir = 180 + ((getDirection() / 90) % 2) * 180 - getDirection();
			for (Node node : arr)
				if (node.getDir() == dir) {
					node.setCt(-1);
					return;
				}
		}
	}

	// �ҳ��͵�ǰλ�����ڵġ��Ϸ��Ĳ��Ҵ�δ�߹��ĸ���
	public Location getValid(Location loc) {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return null;

		// ��ÿ�������߹��Ĵ����Ӵ�С������һ������ѡ������ķ�����
		Location adjLocation;
		arr.sort(new Comparator<Node>() {
			@Override
			public int compare(Node a, Node b) {
				return (a.getCt() < b.getCt()) ? 1 : -1;
			}
		});

		for (Node node : arr) {
			adjLocation = this.getLocation().getAdjacentLocation(node.getDir());
			if (gr.isValid(adjLocation)
					&& (gr.get(adjLocation) == null || gr.get(adjLocation).getColor().equals(Color.RED))) {
				node.setCt(1);
				return adjLocation;
			}
		}
		return null;
	}

	// �жϵ�ǰλ���Ƿ���Լ����ƶ�
	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		Actor adj;
		Location loc = this.getValid(this.getLocation());
		if (loc != null) {
			adj = gr.get(loc);
			next = loc;
			isEnd = adj != null && adj.getColor().equals(Color.RED);
			return true;
		}
		return false;
	}

	// ���׳�ķ���ת����һ����ǰ�ƶ�һ������ԭ����λ��ѹջ��������һ���̻�����ʾ�߹���·��
	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = this.getLocation();
		path.push(loc);
		this.setDirection(loc.getDirectionToward(next));
		this.moveTo(next);
		Flower flower = new Flower(this.getColor());
		flower.putSelfInGrid(gr, loc);
	}
}
