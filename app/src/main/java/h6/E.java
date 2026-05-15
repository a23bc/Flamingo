package h6;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import f0.InterfaceC0878b0;
import j5.AbstractC1109c;
import java.util.Iterator;
import java.util.Set;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class E extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12812a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f12813b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0878b0 f12814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BluetoothAdapter f12815d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0878b0 f12816e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0878b0 f12817f;

    public /* synthetic */ E(int i7, BluetoothAdapter bluetoothAdapter, Context context, InterfaceC0878b0 interfaceC0878b0, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03) {
        this.f12812a = i7;
        this.f12813b = context;
        this.f12814c = interfaceC0878b0;
        this.f12815d = bluetoothAdapter;
        this.f12816e = interfaceC0878b02;
        this.f12817f = interfaceC0878b03;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object next;
        Object next2;
        Set<BluetoothDevice> bondedDevices;
        Object next3;
        Object next4;
        Set<BluetoothDevice> bondedDevices2;
        switch (this.f12812a) {
            case 0:
                String name = null;
                String action = intent != null ? intent.getAction() : null;
                if (action != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -330105134) {
                        if (iHashCode != -301431627) {
                            if (iHashCode != 1821585647 || !action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                            }
                        } else if (!action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        }
                    } else if (!action.equals("yos.music.player.BLUETOOTH_STATUS_REFRESH")) {
                    }
                    if (AbstractC1109c.n(this.f12813b, "android.permission.BLUETOOTH_CONNECT") == 0) {
                        BluetoothAdapter bluetoothAdapter = this.f12815d;
                        Object objK0 = (bluetoothAdapter == null || (bondedDevices = bluetoothAdapter.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices);
                        InterfaceC0878b0 interfaceC0878b0 = this.f12814c;
                        interfaceC0878b0.setValue(objK0);
                        if (Build.VERSION.SDK_INT >= 30) {
                            Iterator it = ((Iterable) interfaceC0878b0.getValue()).iterator();
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
                            Iterator it2 = ((Iterable) interfaceC0878b0.getValue()).iterator();
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
                        this.f12816e.setValue(Boolean.valueOf(name != null));
                        if (name != null) {
                            this.f12817f.setValue(AbstractC1545g.u0(name).toString());
                        }
                        break;
                    }
                }
                break;
            default:
                String name2 = null;
                String action2 = intent != null ? intent.getAction() : null;
                if (action2 != null) {
                    int iHashCode2 = action2.hashCode();
                    if (iHashCode2 != -330105134) {
                        if (iHashCode2 != -301431627) {
                            if (iHashCode2 != 1821585647 || !action2.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                            }
                        } else if (!action2.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                        }
                    } else if (!action2.equals("yos.music.player.BLUETOOTH_STATUS_REFRESH")) {
                    }
                    if (AbstractC1109c.n(this.f12813b, "android.permission.BLUETOOTH_CONNECT") == 0) {
                        BluetoothAdapter bluetoothAdapter2 = this.f12815d;
                        Object objK02 = (bluetoothAdapter2 == null || (bondedDevices2 = bluetoothAdapter2.getBondedDevices()) == null) ? Z4.v.f8818o : Z4.n.K0(bondedDevices2);
                        InterfaceC0878b0 interfaceC0878b02 = this.f12814c;
                        interfaceC0878b02.setValue(objK02);
                        if (Build.VERSION.SDK_INT >= 30) {
                            Iterator it3 = ((Iterable) interfaceC0878b02.getValue()).iterator();
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
                            Iterator it4 = ((Iterable) interfaceC0878b02.getValue()).iterator();
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
                        this.f12816e.setValue(Boolean.valueOf(name2 != null));
                        if (name2 != null) {
                            this.f12817f.setValue(AbstractC1545g.u0(name2).toString());
                        }
                        break;
                    }
                }
                break;
        }
    }
}
