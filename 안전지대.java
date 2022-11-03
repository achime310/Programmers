import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board[0].length;
        int x = 0;
        int y = 0;
        int[] dx = new int[]{-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = new int[]{0, 0, -1, 1, -1, 1, -1, 1};
        int count = 0;

        List<int[]> bombList = new ArrayList<int[]>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    bombList.add(new int[]{i,j});
                    count++;
                }
            }
        }

        if(count>0){
            for(int j=0; j<bombList.size(); j++){
                x = bombList.get(j)[0];
                y = bombList.get(j)[1];
                //System.out.println(x+", "+y);

                for (int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (0 <= nx && nx < n && 0 <= ny && ny < n) {
                        board[nx][ny] = 1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }

        return answer;
    }
}
