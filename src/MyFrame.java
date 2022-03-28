import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    MyTextField tf = new MyTextField();
    MyTextField tf2 = new MyTextField();
    Container c = getContentPane();

    public MyFrame(String s) {
        super(s);

        c.add(tf);
        c.add(tf2);

        t1 thrd1 = new t1("thread 1");
        t2 thrd2 = new t2("thread 2");
        t3 thrd3 = new t3("thread 3");
        t4 thrd4 = new t4("thread 4");
        t5 thrd5 = new t5("thread 5");
        t6 thrd6 = new t6("thread 6");

        thrd1.start();
        thrd2.start();
        thrd3.start();
        thrd4.start();
        thrd5.start();
        thrd6.start();

        setSize(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
    }

    public class t1 extends Thread {
        public t1(String s) {
            super();
            setName(s);
        }
    
        public void run() {
            for(int i = 0; i < 10; i++) {
                tf.setText(tf.getText() + " Ding");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public class t2 extends Thread {
        public t2(String s) {
            super();
            setName(s);
        }
    
        public void run() {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for(int i = 0; i < 10; i++) {
                tf.setText(tf.getText() + " Dong");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public class t3 extends Thread {
        public t3(String s) {
            super();
            setName(s);
        }
    
        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            for(int i = 0; i < 10; i++) {
                tf.setText(tf.getText() + " Dang");
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public class t4 extends Thread {
        public t4(String s) {
            super();
            setName(s);
        }
        int i = 1;
        public void run() {
            tf2.setText(tf2.getText() + i + " Cucciolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Mammolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Brontolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Sleepy");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Eolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Gongolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Molino");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public class t5 extends Thread {
        public t5(String s) {
            super();
            setName(s);
        }
        int i = 1;
        public void run() {
            try {
                sleep(500);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Cucciolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Mammolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Brontolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Sleepy");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Eolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Gongolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Molino");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public class t6 extends Thread {
        public t6(String s) {
            super();
            setName(s);
        }
        int i = 1;
        public void run() {
            try {
                sleep(1000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Cucciolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Mammolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Brontolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Sleepy");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Eolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Gongolo");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            tf2.setText(tf2.getText() + i + " Molino");
            i++;
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
