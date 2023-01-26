//package e0075_Threads_BLOCKED_try_3_FROM_INTEM;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class AddContactViaThread extends Thread implements KeyListener {
//    public AddContactViaThread(){
//        start();
//    }
//
//    public void run(){
//        try {
//            addContact();
//        } catch (AWTException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        // TODO Auto-generated method stub
//        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
//            System.exit(0);
//        }
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//        // TODO Auto-generated method stub
//
//    }
//
//    private void addContact() throws AWTException {
//        Robot bot               = new Robot();
//
//        // detect the click position
//        int addX = this.getX()-5;
//        int addY = this.getY()-5;
//
//        super.setAlwaysOnTop(true);
//
//        List<Calls> allCalls = this.arrayListCalls.stream()
//                .distinct()
//                .sorted(Comparator.comparing(Calls::getCallsignName))
//                .collect(Collectors.toList());
//
//        int iii = 0;
//        for (Calls entry : allCalls){
//            iii++;
//            //bot.delay(100);
//            if(this.getX()== 0) break;
//            if(this.getY()== 0) break;
//
//            // Code gekürzt
//        }
//
//        super.setAlwaysOnTop(false);
//        JOptionPane.showMessageDialog(null, iii + " User-Import finished.");
//    }
//}
