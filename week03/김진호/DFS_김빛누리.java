public class dd {
    static int[][] map = {
            {0,  0,  0,  0,  0,  0,  0}, // row0 : dummy
            {0, 11, 12, 13, 14, 15, 16}, // row 1
            {0, 21, 22, 23, 24, 25, 26},
            {0, 31, 32, 33, 34, 35, 36},
            {0, 41, 42, 128, 44, 45, 46},
            {0, 51, 52, 53, 54, 55, 56},
            {0, 61, 62, 63, 64, 65, 256}
            //    1    2    3    4    5    6    col0 : dummy
    };
    
    // delta: 상 하 좌 우
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    
    // visit    재방문 체크
    static boolean[][] visit;
    static int COUNT;
    public static void main(String[] args) {    
        // dfs 초기화
        visit = new boolean[7][7];
        COUNT = 0;
        dfs(1, 1);
        
        System.out.println("COUNT: " + COUNT);
    }
    static void dfs(int y, int x) {
    
        
        // 4방 방문 시도
         for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];
            
            // range, visit
            // 기타 문제에서 제시된 조건 체크
            
            
            // 방문가능 -> 호출
            dfs(ny, nx);
            
        }
    }
    

}
