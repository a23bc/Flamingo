package K4;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r extends n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Serializable f4067o;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4067o = bool;
    }

    public static boolean c(r rVar) {
        Serializable serializable = rVar.f4067o;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final Number a() {
        Serializable serializable = this.f4067o;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new M4.i((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String b() {
        Serializable serializable = this.f4067o;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return a().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        Serializable serializable = this.f4067o;
        Serializable serializable2 = rVar.f4067o;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (c(this) && c(rVar)) {
            return a().longValue() == rVar.a().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = a().doubleValue();
        double dDoubleValue2 = rVar.a().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f4067o;
        if (serializable == null) {
            return 31;
        }
        if (c(this)) {
            jDoubleToLongBits = a().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f4067o = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f4067o = str;
    }
}
