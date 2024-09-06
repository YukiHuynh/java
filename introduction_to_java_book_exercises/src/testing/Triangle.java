import stdlip.j

package testing;

public class Triangle {

	public static void main(String[] args) {
		
		/*
        int n = 50;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for(int i = 0; i <= n; i++) {
            StdDraw.line(0, n - i, i, 0);
        }

        double t = Math.sqrt(3.0)/2.0;
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5,   t);
        StdDraw.line(0.5,   t, 0.0, 0.0);
        StdDraw.point(0.5, t/3.0);
        */
        int n = 200;
        double[] x = new double[n + 1];
        double[] y = new double[n + 1];

        for(int i = 0; i <= n; i++) {
            x[i] = Math.PI * i / n;
        }

        for(int i = 0; i <= n; i++) {
            y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, 2.0);

        for(int i = 1; i <= n; i++){
            StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
        }
		
	}
	
}
