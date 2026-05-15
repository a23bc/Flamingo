package androidx.media;

import d2.C0821i;
import java.util.Arrays;
import n1.c;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9769a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9770b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9771c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9772d = -1;

    public final boolean equals(Object obj) {
        int i7;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f9770b == audioAttributesImplBase.f9770b) {
            int i8 = this.f9771c;
            int i9 = audioAttributesImplBase.f9771c;
            int i10 = audioAttributesImplBase.f9772d;
            if (i10 == -1) {
                int i11 = audioAttributesImplBase.f9769a;
                int i12 = AudioAttributesCompat.f9765b;
                if ((i9 & 1) != 1) {
                    if ((i9 & 4) != 4) {
                        switch (i11) {
                            case 2:
                                i7 = 0;
                                break;
                            case 3:
                                i7 = 8;
                                break;
                            case 4:
                                i7 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                                i7 = 5;
                                break;
                            case 6:
                                i7 = 2;
                                break;
                            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                                i7 = 10;
                                break;
                            case 12:
                            default:
                                i7 = 3;
                                break;
                            case 13:
                                i7 = 1;
                                break;
                        }
                    } else {
                        i7 = 6;
                    }
                } else {
                    i7 = 7;
                }
            } else {
                i7 = i10;
            }
            if (i7 == 6) {
                i9 |= 4;
            } else if (i7 == 7) {
                i9 |= 1;
            }
            if (i8 == (i9 & 273) && this.f9769a == audioAttributesImplBase.f9769a && this.f9772d == i10) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9770b), Integer.valueOf(this.f9771c), Integer.valueOf(this.f9769a), Integer.valueOf(this.f9772d)});
    }

    public final String toString() {
        String strS;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f9772d != -1) {
            sb.append(" stream=");
            sb.append(this.f9772d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i7 = this.f9769a;
        int i8 = AudioAttributesCompat.f9765b;
        switch (i7) {
            case 0:
                strS = "USAGE_UNKNOWN";
                break;
            case 1:
                strS = "USAGE_MEDIA";
                break;
            case 2:
                strS = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strS = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strS = "USAGE_ALARM";
                break;
            case 5:
                strS = "USAGE_NOTIFICATION";
                break;
            case 6:
                strS = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strS = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strS = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                strS = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                strS = "USAGE_NOTIFICATION_EVENT";
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                strS = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strS = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strS = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strS = "USAGE_GAME";
                break;
            case 15:
            default:
                strS = c.s(i7, "unknown usage ");
                break;
            case 16:
                strS = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strS);
        sb.append(" content=");
        sb.append(this.f9770b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9771c).toUpperCase());
        return sb.toString();
    }
}
