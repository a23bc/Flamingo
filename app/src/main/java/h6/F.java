package h6;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import j5.AbstractC1109c;
import java.util.Iterator;
import java.util.Set;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class F implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f12830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ BluetoothAdapter f12831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12834t;

    public /* synthetic */ F(int i7, BluetoothAdapter bluetoothAdapter, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03) {
        this.f12829o = i7;
        this.f12830p = context;
        this.f12831q = bluetoothAdapter;
        this.f12832r = interfaceC0878b0;
        this.f12833s = interfaceC0878b02;
        this.f12834t = interfaceC0878b03;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12829o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                Y4.o oVar = Y4.o.f8736a;
                if (iIntValue == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    c0912t.X(424887619);
                    boolean zF = c0912t.f(this.f12830p) | c0912t.h(this.f12831q);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        final InterfaceC0878b0 interfaceC0878b0 = this.f12832r;
                        final BluetoothAdapter bluetoothAdapter = this.f12831q;
                        final Context context = this.f12830p;
                        final InterfaceC0878b0 interfaceC0878b02 = this.f12833s;
                        final InterfaceC0878b0 interfaceC0878b03 = this.f12834t;
                        final int i7 = 0;
                        InterfaceC1182c interfaceC1182c = new InterfaceC1182c() { // from class: h6.D
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj3) {
                                Object next;
                                Object next2;
                                Set<BluetoothDevice> bondedDevices;
                                Object next3;
                                Object next4;
                                Set<BluetoothDevice> bondedDevices2;
                                f0.J j3 = (f0.J) obj3;
                                switch (i7) {
                                    case 0:
                                        Context context2 = context;
                                        AbstractC1209k.f(context2, "$contextCompose");
                                        InterfaceC0878b0 interfaceC0878b04 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b04, "$connectedDevices");
                                        InterfaceC0878b0 interfaceC0878b05 = interfaceC0878b02;
                                        AbstractC1209k.f(interfaceC0878b05, "$showName");
                                        InterfaceC0878b0 interfaceC0878b06 = interfaceC0878b03;
                                        AbstractC1209k.f(interfaceC0878b06, "$audioDeviceName");
                                        AbstractC1209k.f(j3, "$this$DisposableEffect");
                                        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                                        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                                        intentFilter.addAction("yos.music.player.BLUETOOTH_STATUS_REFRESH");
                                        BluetoothAdapter bluetoothAdapter2 = bluetoothAdapter;
                                        E e7 = new E(0, bluetoothAdapter2, context2, interfaceC0878b04, interfaceC0878b05, interfaceC0878b06);
                                        int i8 = Build.VERSION.SDK_INT;
                                        if (i8 >= 33) {
                                            context2.registerReceiver(e7, intentFilter, 2);
                                        } else {
                                            context2.registerReceiver(e7, intentFilter);
                                        }
                                        if (AbstractC1109c.n(context2, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                            interfaceC0878b04.setValue((bluetoothAdapter2 == null || (bondedDevices = bluetoothAdapter2.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices));
                                            String name = null;
                                            if (i8 >= 30) {
                                                Iterator it = ((Iterable) interfaceC0878b04.getValue()).iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next2 = it.next();
                                                        BluetoothDevice bluetoothDevice = (BluetoothDevice) next2;
                                                        if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice)) {
                                                        }
                                                    } else {
                                                        next2 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) next2;
                                                if (bluetoothDevice2 != null) {
                                                    name = bluetoothDevice2.getAlias();
                                                }
                                            } else {
                                                Iterator it2 = ((Iterable) interfaceC0878b04.getValue()).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) next;
                                                        if (bluetoothDevice3.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice3)) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice4 = (BluetoothDevice) next;
                                                if (bluetoothDevice4 != null) {
                                                    name = bluetoothDevice4.getName();
                                                }
                                            }
                                            interfaceC0878b05.setValue(Boolean.valueOf(name != null));
                                            if (name != null) {
                                                interfaceC0878b06.setValue(AbstractC1545g.u0(name).toString());
                                            }
                                        }
                                        return new D.y0(j3, context2, e7, 4);
                                    default:
                                        Context context3 = context;
                                        AbstractC1209k.f(context3, "$contextCompose");
                                        InterfaceC0878b0 interfaceC0878b07 = interfaceC0878b0;
                                        AbstractC1209k.f(interfaceC0878b07, "$connectedDevices");
                                        InterfaceC0878b0 interfaceC0878b08 = interfaceC0878b02;
                                        AbstractC1209k.f(interfaceC0878b08, "$showName");
                                        InterfaceC0878b0 interfaceC0878b09 = interfaceC0878b03;
                                        AbstractC1209k.f(interfaceC0878b09, "$audioDeviceName");
                                        AbstractC1209k.f(j3, "$this$DisposableEffect");
                                        IntentFilter intentFilter2 = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                                        intentFilter2.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                                        intentFilter2.addAction("yos.music.player.BLUETOOTH_STATUS_REFRESH");
                                        BluetoothAdapter bluetoothAdapter3 = bluetoothAdapter;
                                        E e8 = new E(1, bluetoothAdapter3, context3, interfaceC0878b07, interfaceC0878b08, interfaceC0878b09);
                                        int i9 = Build.VERSION.SDK_INT;
                                        if (i9 >= 33) {
                                            context3.registerReceiver(e8, intentFilter2, 2);
                                        } else {
                                            context3.registerReceiver(e8, intentFilter2);
                                        }
                                        if (AbstractC1109c.n(context3, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                            interfaceC0878b07.setValue((bluetoothAdapter3 == null || (bondedDevices2 = bluetoothAdapter3.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices2));
                                            String name2 = null;
                                            if (i9 >= 30) {
                                                Iterator it3 = ((Iterable) interfaceC0878b07.getValue()).iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next4 = it3.next();
                                                        BluetoothDevice bluetoothDevice5 = (BluetoothDevice) next4;
                                                        if (bluetoothDevice5.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice5)) {
                                                        }
                                                    } else {
                                                        next4 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice6 = (BluetoothDevice) next4;
                                                if (bluetoothDevice6 != null) {
                                                    name2 = bluetoothDevice6.getAlias();
                                                }
                                            } else {
                                                Iterator it4 = ((Iterable) interfaceC0878b07.getValue()).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next3 = it4.next();
                                                        BluetoothDevice bluetoothDevice7 = (BluetoothDevice) next3;
                                                        if (bluetoothDevice7.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice7)) {
                                                        }
                                                    } else {
                                                        next3 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice8 = (BluetoothDevice) next3;
                                                if (bluetoothDevice8 != null) {
                                                    name2 = bluetoothDevice8.getName();
                                                }
                                            }
                                            interfaceC0878b08.setValue(Boolean.valueOf(name2 != null));
                                            if (name2 != null) {
                                                interfaceC0878b09.setValue(AbstractC1545g.u0(name2).toString());
                                            }
                                        }
                                        return new D.y0(j3, context3, e8, 5);
                                }
                            }
                        };
                        c0912t.i0(interfaceC1182c);
                        objK = interfaceC1182c;
                    }
                    c0912t.p(false);
                    C0879c.d(oVar, (InterfaceC1182c) objK, c0912t);
                }
                return oVar;
            default:
                C0912t c0912t2 = (C0912t) obj;
                int iIntValue2 = ((Number) obj2).intValue() & 3;
                Y4.o oVar2 = Y4.o.f8736a;
                if (iIntValue2 == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    c0912t2.X(1201859935);
                    boolean zF2 = c0912t2.f(this.f12830p) | c0912t2.h(this.f12831q);
                    Object objK2 = c0912t2.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        final InterfaceC0878b0 interfaceC0878b04 = this.f12832r;
                        final BluetoothAdapter bluetoothAdapter2 = this.f12831q;
                        final Context context2 = this.f12830p;
                        final InterfaceC0878b0 interfaceC0878b05 = this.f12833s;
                        final InterfaceC0878b0 interfaceC0878b06 = this.f12834t;
                        final int i8 = 1;
                        InterfaceC1182c interfaceC1182c2 = new InterfaceC1182c() { // from class: h6.D
                            @Override // l5.InterfaceC1182c
                            public final Object b(Object obj3) {
                                Object next;
                                Object next2;
                                Set<BluetoothDevice> bondedDevices;
                                Object next3;
                                Object next4;
                                Set<BluetoothDevice> bondedDevices2;
                                f0.J j3 = (f0.J) obj3;
                                switch (i8) {
                                    case 0:
                                        Context context22 = context2;
                                        AbstractC1209k.f(context22, "$contextCompose");
                                        InterfaceC0878b0 interfaceC0878b042 = interfaceC0878b04;
                                        AbstractC1209k.f(interfaceC0878b042, "$connectedDevices");
                                        InterfaceC0878b0 interfaceC0878b052 = interfaceC0878b05;
                                        AbstractC1209k.f(interfaceC0878b052, "$showName");
                                        InterfaceC0878b0 interfaceC0878b062 = interfaceC0878b06;
                                        AbstractC1209k.f(interfaceC0878b062, "$audioDeviceName");
                                        AbstractC1209k.f(j3, "$this$DisposableEffect");
                                        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                                        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                                        intentFilter.addAction("yos.music.player.BLUETOOTH_STATUS_REFRESH");
                                        BluetoothAdapter bluetoothAdapter22 = bluetoothAdapter2;
                                        E e7 = new E(0, bluetoothAdapter22, context22, interfaceC0878b042, interfaceC0878b052, interfaceC0878b062);
                                        int i82 = Build.VERSION.SDK_INT;
                                        if (i82 >= 33) {
                                            context22.registerReceiver(e7, intentFilter, 2);
                                        } else {
                                            context22.registerReceiver(e7, intentFilter);
                                        }
                                        if (AbstractC1109c.n(context22, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                            interfaceC0878b042.setValue((bluetoothAdapter22 == null || (bondedDevices = bluetoothAdapter22.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices));
                                            String name = null;
                                            if (i82 >= 30) {
                                                Iterator it = ((Iterable) interfaceC0878b042.getValue()).iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        next2 = it.next();
                                                        BluetoothDevice bluetoothDevice = (BluetoothDevice) next2;
                                                        if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice)) {
                                                        }
                                                    } else {
                                                        next2 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) next2;
                                                if (bluetoothDevice2 != null) {
                                                    name = bluetoothDevice2.getAlias();
                                                }
                                            } else {
                                                Iterator it2 = ((Iterable) interfaceC0878b042.getValue()).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) next;
                                                        if (bluetoothDevice3.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice3)) {
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice4 = (BluetoothDevice) next;
                                                if (bluetoothDevice4 != null) {
                                                    name = bluetoothDevice4.getName();
                                                }
                                            }
                                            interfaceC0878b052.setValue(Boolean.valueOf(name != null));
                                            if (name != null) {
                                                interfaceC0878b062.setValue(AbstractC1545g.u0(name).toString());
                                            }
                                        }
                                        return new D.y0(j3, context22, e7, 4);
                                    default:
                                        Context context3 = context2;
                                        AbstractC1209k.f(context3, "$contextCompose");
                                        InterfaceC0878b0 interfaceC0878b07 = interfaceC0878b04;
                                        AbstractC1209k.f(interfaceC0878b07, "$connectedDevices");
                                        InterfaceC0878b0 interfaceC0878b08 = interfaceC0878b05;
                                        AbstractC1209k.f(interfaceC0878b08, "$showName");
                                        InterfaceC0878b0 interfaceC0878b09 = interfaceC0878b06;
                                        AbstractC1209k.f(interfaceC0878b09, "$audioDeviceName");
                                        AbstractC1209k.f(j3, "$this$DisposableEffect");
                                        IntentFilter intentFilter2 = new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED");
                                        intentFilter2.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                                        intentFilter2.addAction("yos.music.player.BLUETOOTH_STATUS_REFRESH");
                                        BluetoothAdapter bluetoothAdapter3 = bluetoothAdapter2;
                                        E e8 = new E(1, bluetoothAdapter3, context3, interfaceC0878b07, interfaceC0878b08, interfaceC0878b09);
                                        int i9 = Build.VERSION.SDK_INT;
                                        if (i9 >= 33) {
                                            context3.registerReceiver(e8, intentFilter2, 2);
                                        } else {
                                            context3.registerReceiver(e8, intentFilter2);
                                        }
                                        if (AbstractC1109c.n(context3, "android.permission.BLUETOOTH_CONNECT") == 0) {
                                            interfaceC0878b07.setValue((bluetoothAdapter3 == null || (bondedDevices2 = bluetoothAdapter3.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices2));
                                            String name2 = null;
                                            if (i9 >= 30) {
                                                Iterator it3 = ((Iterable) interfaceC0878b07.getValue()).iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        next4 = it3.next();
                                                        BluetoothDevice bluetoothDevice5 = (BluetoothDevice) next4;
                                                        if (bluetoothDevice5.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice5)) {
                                                        }
                                                    } else {
                                                        next4 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice6 = (BluetoothDevice) next4;
                                                if (bluetoothDevice6 != null) {
                                                    name2 = bluetoothDevice6.getAlias();
                                                }
                                            } else {
                                                Iterator it4 = ((Iterable) interfaceC0878b07.getValue()).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        next3 = it4.next();
                                                        BluetoothDevice bluetoothDevice7 = (BluetoothDevice) next3;
                                                        if (bluetoothDevice7.getBluetoothClass().getMajorDeviceClass() != 1024 || !M3.a.z(bluetoothDevice7)) {
                                                        }
                                                    } else {
                                                        next3 = null;
                                                    }
                                                }
                                                BluetoothDevice bluetoothDevice8 = (BluetoothDevice) next3;
                                                if (bluetoothDevice8 != null) {
                                                    name2 = bluetoothDevice8.getName();
                                                }
                                            }
                                            interfaceC0878b08.setValue(Boolean.valueOf(name2 != null));
                                            if (name2 != null) {
                                                interfaceC0878b09.setValue(AbstractC1545g.u0(name2).toString());
                                            }
                                        }
                                        return new D.y0(j3, context3, e8, 5);
                                }
                            }
                        };
                        c0912t2.i0(interfaceC1182c2);
                        objK2 = interfaceC1182c2;
                    }
                    c0912t2.p(false);
                    C0879c.d(oVar2, (InterfaceC1182c) objK2, c0912t2);
                }
                return oVar2;
        }
    }
}
