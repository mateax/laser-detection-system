package org.appinventor;

import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.BluetoothClient;
import com.google.appinventor.components.runtime.util.YailList;

class Screen1 extends Form implements HandlesEventDispatching {
    private ListPicker ListPicker1;
    private BluetoothClient BluetoothClient1;

    private HorizontalScrollArrangement HorizontalScrollArrangement1;
    private Button Button1;
    private Button Button2;
    private Button Button3;

    private HorizontalScrollArrangement HorizontalScrollArrangement2;
    private Button Button4;
    private Button Button5;
    private Button Button6;

    private HorizontalScrollArrangement HorizontalScrollArrangement3;
    private Button Button7;
    private Button Button8;
    private Button Button9;

    private HorizontalScrollArrangement HorizontalScrollArrangement5;
    private Button Button10;
    private Image Image1;
    private Button Button11;

    private HorizontalScrollArrangement HorizontalScrollArrangement6;
    private Button Button13;
    private Image Image2;
    private Button Button14;

    private HorizontalScrollArrangement HorizontalScrollArrangement7;
    private Button Button15;
    private Image Image3;
    private Button Button16;



    protected void $define() {
        this.AlignHorizontal(3);
        this.AppName("control_app");
        this.BackgroundColor(0xFF000000 );
        this.Scrollable(true);
        this.Title("Matea - zavrsni rad");

        ListPicker1 = new ListPicker(this);
        ListPicker1.BackgroundColor(0xFF0000FF);
        ListPicker1.FontBold(true);
        ListPicker1.FontSize(16);
        ListPicker1.Height(30);
        ListPicker1.Width(LENGTH_FILL_PARENT);
        ListPicker1.Text("Bluethooth povezivanje");
        ListPicker1.TextColor(0xFFFFFFFF);

        HorizontalScrollArrangement1 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement1.Width(-1100);

        Button1 = new Button(HorizontalScrollArrangement1);
        Button1.Height(110);
        Button1.Width(110);
        Button1.Image("naprijed_lijevo.PNG");

        Button2 = new Button(HorizontalScrollArrangement1);
        Button2.Height(110);
        Button2.Width(110);
        Button2.Image("naprijed.PNG");

        Button3 = new Button(HorizontalScrollArrangement1);
        Button3.Height(110);
        Button3.Width(110);
        Button3.Image("naprijed_desno.PNG");

        HorizontalScrollArrangement2 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement2.Width(-1100);

        Button4 = new Button(HorizontalScrollArrangement2);
        Button4.Height(110);
        Button4.Width(110);
        Button4.Image("lijevo.PNG");

        Button5 = new Button(HorizontalScrollArrangement2);
        Button5.Height(110);
        Button5.Width(110);
        Button5.Image("play_stop.PNG");

        Button6 = new Button(HorizontalScrollArrangement2);
        Button6.Height(110);
        Button6.Width(110);
        Button6.Image("desno.PNG");

        HorizontalScrollArrangement3 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement3.Width(-1100);

        Button7 = new Button(HorizontalScrollArrangement3);
        Button7.Height(110);
        Button7.Width(110);
        Button7.Image("nazad_lijevo.PNG");

        Button8 = new Button(HorizontalScrollArrangement3);
        Button8.Height(110);
        Button8.Width(110);
        Button8.Image("nazad.PNG");

        Button9 = new Button(HorizontalScrollArrangement3);
        Button9.Height(110);
        Button9.Width(110);
        Button9.Image("nazad_desno.PNG");

        HorizontalScrollArrangement5 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement5.Width(-1100);

        Button10 = new Button(HorizontalScrollArrangement5);
        Button10.Height(110);
        Button10.Width(110);
        Button10.Image("copy_rotiranje_lijevo.png");

        Image1 = new Image(HorizontalScrollArrangement5);
        Image1.Height(110);
        Image1.Width(110);

        Button11 = new Button(HorizontalScrollArrangement5);
        Button11.Height(110);
        Button11.Width(110);
        Button11.Image("copy_rotiranje_desno.PNG");

        HorizontalScrollArrangement6 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement6.Width(-1100);

        Button13 = new Button(HorizontalScrollArrangement6);
        Button13.Height(110);
        Button13.Width(110);
        Button13.Image("1_lijevo.png");

        Image2 = new Image(HorizontalScrollArrangement6);
        Image2.Height(110);
        Image2.Width(110);

        Button14 = new Button(HorizontalScrollArrangement6);
        Button14.Height(110);
        Button14.Width(110);
        Button14.Image("1_desno.png");

        HorizontalScrollArrangement7 = new HorizontalScrollArrangement(this);
        HorizontalScrollArrangement7.Width(-1100);

        Button15 = new Button(HorizontalScrollArrangement7);
        Button15.Height(110);
        Button15.Width(110);
        Button15.Image("3_lijevo.png");

        Image3 = new Image(HorizontalScrollArrangement7);
        Image3.Height(110);
        Image3.Width(110);

        Button16 = new Button(HorizontalScrollArrangement7);
        Button16.Height(110);
        Button16.Width(110);
        Button16.Image("3_desno.png");

        BluetoothClient1 = new BluetoothClient(this);

        EventDispatcher.registerEventForDelegation(this, "BeforePickingEvent", "BeforePicking");
        EventDispatcher.registerEventForDelegation(this, "AfterPickingEvent", "AfterPicking");
        EventDispatcher.registerEventForDelegation(this, "TouchDownEvent", "TouchDown");
        EventDispatcher.registerEventForDelegation(this, "TouchUpEvent", "TouchUp");
    }

    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params) {
        if (component.equals(ListPicker1) && eventName.equals("BeforePicking")) {
            ListPicker1BeforePicking();
            return true;
        }
        if (component.equals(ListPicker1) && eventName.equals("AfterPicking")) {
            ListPicker1AfterPicking();
            return true;
        }
        if (component.equals(Button1) && eventName.equals("TouchDown")) {
            Button1TouchDown();
            return true;
        }
        if (component.equals(Button1) && eventName.equals("TouchUp")) {
            Button1TouchUp();
            return true;
        }
        if (component.equals(Button2) && eventName.equals("TouchDown")) {
            Button2TouchDown();
            return true;
        }
        if (component.equals(Button2) && eventName.equals("TouchUp")) {
            Button2TouchUp();
            return true;
        }
        if (component.equals(Button3) && eventName.equals("TouchDown")) {
            Button3TouchDown();
            return true;
        }
        if (component.equals(Button3) && eventName.equals("TouchUp")) {
            Button3TouchUp();
            return true;
        }
        if (component.equals(Button4) && eventName.equals("TouchDown")) {
            Button4TouchDown();
            return true;
        }
        if (component.equals(Button4) && eventName.equals("TouchUp")) {
            Button4TouchUp();
            return true;
        }
        if (component.equals(Button5) && eventName.equals("TouchDown")) {
            Button5TouchDown();
            return true;
        }
        if (component.equals(Button5) && eventName.equals("TouchUp")) {
            Button5TouchUp();
            return true;
        }
        if (component.equals(Button6) && eventName.equals("TouchDown")) {
            Button6TouchDown();
            return true;
        }
        if (component.equals(Button6) && eventName.equals("TouchUp")) {
            Button6TouchUp();
            return true;
        }
        if (component.equals(Button7) && eventName.equals("TouchDown")) {
            Button7TouchDown();
            return true;
        }
        if (component.equals(Button7) && eventName.equals("TouchUp")) {
            Button7TouchUp();
            return true;
        }
        if (component.equals(Button8) && eventName.equals("TouchDown")) {
            Button8TouchDown();
            return true;
        }
        if (component.equals(Button8) && eventName.equals("TouchUp")) {
            Button8TouchUp();
            return true;
        }
        if (component.equals(Button9) && eventName.equals("TouchDown")) {
            Button9TouchDown();
            return true;
        }
        if (component.equals(Button9) && eventName.equals("TouchUp")) {
            Button9TouchUp();
            return true;
        }
        if (component.equals(Button10) && eventName.equals("TouchDown")) {
            Button10TouchDown();
            return true;
        }
        if (component.equals(Button10) && eventName.equals("TouchUp")) {
            Button10TouchUp();
            return true;
        }
        if (component.equals(Button11) && eventName.equals("TouchDown")) {
            Button11TouchDown();
            return true;
        }
        if (component.equals(Button11) && eventName.equals("TouchUp")) {
            Button11TouchUp();
            return true;
        }
        if (component.equals(Button13) && eventName.equals("TouchDown")) {
            Button13TouchDown();
            return true;
        }
        if (component.equals(Button13) && eventName.equals("TouchUp")) {
            Button13TouchUp();
            return true;
        }
        if (component.equals(Button14) && eventName.equals("TouchDown")) {
            Button14TouchDown();
            return true;
        }
        if (component.equals(Button14) && eventName.equals("TouchUp")) {
            Button14TouchUp();
            return true;
        }
        if (component.equals(Button15) && eventName.equals("TouchDown")) {
            Button15TouchDown();
            return true;
        }
        if (component.equals(Button15) && eventName.equals("TouchUp")) {
            Button15TouchUp();
            return true;
        }
        if (component.equals(Button16) && eventName.equals("TouchDown")) {
            Button16TouchDown();
            return true;
        }
        if (component.equals(Button16) && eventName.equals("TouchUp")) {
            Button16TouchUp();
            return true;
        }
        return false;
    }

    public void ListPicker1BeforePicking() {
        ListPicker1.Elements(YailList.makeList(BluetoothClient1.AddressesAndNames()));
    }

    public void ListPicker1AfterPicking() {
        ListPicker1.Selection(BluetoothClient1.Connect(ListPicker1.Selection()));
    }

    public void Button1TouchDown() {
        BluetoothClient1.SendText("FORWARDLEFT");
    }

    public void Button1TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button2TouchDown() {
        BluetoothClient1.SendText("FORWARD");
    }

    public void Button2TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button3TouchDown() {
        BluetoothClient1.SendText("FORWARDRIGHT");
    }

    public void Button3TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button4TouchDown() {
        BluetoothClient1.SendText("LEFT");
    }

    public void Button4TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button5TouchDown() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button5TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button6TouchDown() {
        BluetoothClient1.SendText("RIGHT");
    }

    public void Button6TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button7TouchDown() {
        BluetoothClient1.SendText("BACKWARDLEFT");
    }

    public void Button7TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button8TouchDown() {
        BluetoothClient1.SendText("BACKWARD");
    }

    public void Button8TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button9TouchDown() {
        BluetoothClient1.SendText("BACKWARDRIGHT");
    }

    public void Button9TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button10TouchDown() {
        BluetoothClient1.SendText("ROTATELEFT");
    }

    public void Button10TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button11TouchDown() {
        BluetoothClient1.SendText("ROTATERIGHT");
    }

    public void Button11TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button13TouchDown() {
        BluetoothClient1.SendText("ONEROTATELEFT");
    }

    public void Button13TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button14TouchDown() {
        BluetoothClient1.SendText("ONEROTATERIGHT");
    }

    public void Button14TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button15TouchDown() {
        BluetoothClient1.SendText("THREEROTATELEFT");
    }

    public void Button15TouchUp() {
        BluetoothClient1.SendText("STOP");
    }

    public void Button16TouchDown() {
        BluetoothClient1.SendText("THREEROTATERIGHT");
    }

    public void Button16TouchUp() {
        BluetoothClient1.SendText("STOP");
    }
}