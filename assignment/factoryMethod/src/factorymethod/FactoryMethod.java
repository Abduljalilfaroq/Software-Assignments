
package factorymethod;
        
 class FactoryMethod {
    public static void main(String[] args) {
    MazeGame ordinaryGame = new OrdinaryMazeGame();
    MazeGame magicGame = new MagicMazeGame();
    
    ordinaryGame.makeRoom();
    
    }
}





