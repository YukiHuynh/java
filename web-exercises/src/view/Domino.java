package view;

import java.util.Scanner;

public class Domino {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc vào N, M, K
        int N = scanner.nextInt();  // Số hàng
        int M = scanner.nextInt();  // Số cột
        int K = scanner.nextInt();  // Số lượng miếng domino

        int[][] A = new int[N][M];
        
        // Đọc vào bảng giá trị A[i][j]
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        
        // Tính tổng lớn nhất có thể đạt được
        System.out.println(maxDominoSum(N, M, K, A));
    }
    
    public static long maxDominoSum(int N, int M, int K, int[][] A) {
        // Bảng DP để lưu giá trị tối ưu cho mỗi cột khi duyệt qua các hàng
        long[][] dp = new long[M + 1][K + 1];
        
        // Khởi tạo DP với giá trị âm vô cùng, chỉ có dp[0][0] = 0 là trạng thái cơ bản
        for (int j = 0; j <= M; j++) {
            for (int k = 0; k <= K; k++) {
                dp[j][k] = Long.MIN_VALUE;
            }
        }
        dp[0][0] = 0;
        
        // Duyệt qua từng hàng
        for (int i = 0; i < N; i++) {
            long[][] newDp = new long[M + 1][K + 1];
            for (int j = 0; j <= M; j++) {
                for (int usedDominoes = 0; usedDominoes <= K; usedDominoes++) {
                    newDp[j][usedDominoes] = Long.MIN_VALUE;
                }
            }
            
            // Xét từng cột trong hàng hiện tại
            for (int j = 0; j < M; j++) {
                for (int usedDominoes = 0; usedDominoes <= K; usedDominoes++) {
                    if (dp[j][usedDominoes] == Long.MIN_VALUE) continue;
                    
                    // Không đặt domino tại ô hiện tại
                    newDp[j + 1][usedDominoes] = Math.max(newDp[j + 1][usedDominoes], dp[j][usedDominoes]);
                    
                    // Đặt domino ngang (trên cùng hàng)
                    if (j + 1 < M && usedDominoes + 1 <= K) {
                        newDp[j + 2][usedDominoes + 1] = Math.max(
                            newDp[j + 2][usedDominoes + 1],
                            dp[j][usedDominoes] + A[i][j] + A[i][j + 1]
                        );
                    }
                    
                    // Đặt domino dọc (ở hàng dưới)
                    if (i + 1 < N && usedDominoes + 1 <= K) {
                        newDp[j + 1][usedDominoes + 1] = Math.max(
                            newDp[j + 1][usedDominoes + 1],
                            dp[j][usedDominoes] + A[i][j] + A[i + 1][j]
                        );
                    }
                }
            }
            
            // Cập nhật dp bằng newDp cho hàng tiếp theo
            dp = newDp;
        }
        
        // Giá trị lớn nhất có thể đạt được khi sử dụng tối đa K miếng domino
        long maxSum = Long.MIN_VALUE;
        for (int usedDominoes = 0; usedDominoes <= K; usedDominoes++) {
            maxSum = Math.max(maxSum, dp[M][usedDominoes]);
        }
        
        return maxSum;
    }
}
