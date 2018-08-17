package org.jsoup.safety;

import org.jsoup.helper.Validate;

abstract class g {
    private String a;

    g(String str) {
        Validate.notNull(str);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.a;
        if (str == null) {
            if (gVar.a != null) {
                return false;
            }
        } else if (!str.equals(gVar.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public String toString() {
        return this.a;
    }
}
