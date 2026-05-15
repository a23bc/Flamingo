package w3;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: w3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1747r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.f0 f19336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1746q0 f19339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f19340e;

    public C1747r0(x3.f0 f0Var, int i7, int i8, boolean z6, InterfaceC1746q0 interfaceC1746q0, Bundle bundle) {
        this.f19336a = f0Var;
        this.f19337b = i7;
        this.f19338c = i8;
        this.f19339d = interfaceC1746q0;
        this.f19340e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1747r0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1747r0 c1747r0 = (C1747r0) obj;
        InterfaceC1746q0 interfaceC1746q0 = this.f19339d;
        return (interfaceC1746q0 == null && c1747r0.f19339d == null) ? this.f19336a.equals(c1747r0.f19336a) : w2.t.a(interfaceC1746q0, c1747r0.f19339d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19339d, this.f19336a});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        x3.f0 f0Var = this.f19336a;
        sb.append(f0Var.f20039a.f20036a);
        sb.append(", uid=");
        sb.append(f0Var.f20039a.f20038c);
        sb.append("})");
        return sb.toString();
    }
}
