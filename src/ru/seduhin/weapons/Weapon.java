package ru.surname.weapons;

abstract class Weapon {
        private int ammo;

        public Weapon(int ammo) {
            if (ammo < 0 ) throw new RuntimeException();
            this.ammo = ammo;
        }

        abstract void shoot();

        int ammo() {
            return ammo;
        }

        public boolean getAmmo() {
            if(ammo==0) return false;
            ammo--;
            return true;
        }

        public int load(int ammo) {
            if (ammo < 0) throw new RuntimeException();
            int tmp = ammo;
            this.ammo=ammo;
            return tmp;
        }


}