package com.walking.intensive.chapter5.task21;

public class Main {
    public static void main(String[] args) {
        Parallelepiped parallelepiped1 = new Parallelepiped(1, 1, 1, 3, 3, 3);
        Parallelepiped parallelepiped2 = new Parallelepiped(-1, -1, -1, -2, -2, -2);
        Parallelepiped parallelepiped3 = new Parallelepiped(-10, -10, -10, 10, 10, 10);
        Parallelepiped parallelepiped4 = new Parallelepiped(0, 0, 0, 4, 4, 4);

        Sphere sphere1 = new Sphere(5, 5, 5, 1);
        Sphere sphere2 = new Sphere(1, 1, 0, 1);
        Sphere sphere3 = new Sphere(3, 3, 2, 2);
        Sphere sphere4 = new Sphere(-2, -2, -2, 2);
        Sphere sphere5 = new Sphere(-1, -1, -1, 4);
        Sphere sphere6 = new Sphere(0, 0, 0, 10);
        Sphere sphere7 = new Sphere(-5, -10, -11, 1);
        Sphere sphere8 = new Sphere(2, 2, 2, 1);
        Sphere sphere9 = new Sphere(0, 0, 0, 1);

        System.out.println("1. Параллепипед1 и сфера1 - false - " + intersectionSphereParallelepiped(parallelepiped1, sphere1));
        System.out.println("2. Параллепипед1 и сфера2 - true - " + intersectionSphereParallelepiped(parallelepiped1, sphere2));
        System.out.println("3. Параллепипед1 и сфера3 - true - " + intersectionSphereParallelepiped(parallelepiped1, sphere3));
        System.out.println("4. Параллепипед1 и сфера3 - false - " + intersectionSphereParallelepiped(parallelepiped1, sphere4));
        System.out.println("5. Параллепипед2 и сфера1 - false - " + intersectionSphereParallelepiped(parallelepiped2, sphere1));
        System.out.println("6. Параллепипед2 и сфера2 - false - " + intersectionSphereParallelepiped(parallelepiped2, sphere2));
        System.out.println("7. Параллепипед2 и сфера3 - false - " + intersectionSphereParallelepiped(parallelepiped2, sphere3));
        System.out.println("8. Параллепипед2 и сфера4 - true - " + intersectionSphereParallelepiped(parallelepiped2, sphere4));
        System.out.println("9. Параллелепипед1 и сфера5 - тру - " + intersectionSphereParallelepiped(parallelepiped1, sphere5));
        System.out.println("10. Параллелепипед2 и сфера5 - тру - " + intersectionSphereParallelepiped(parallelepiped2, sphere5));
        System.out.println("11. Параллелепипед1 и сфера6 - тру - " + intersectionSphereParallelepiped(parallelepiped1, sphere6));
        System.out.println("12. Параллелепипед2 и сфера6 - тру - " + intersectionSphereParallelepiped(parallelepiped2, sphere6));
        System.out.println("13. Параллелепипед3 и сфера2 - тру - " + intersectionSphereParallelepiped(parallelepiped3, sphere2));
        System.out.println("14. Парралелепипед3 и сфера7 - тру - " + intersectionSphereParallelepiped(parallelepiped3, sphere7));
        System.out.println("15. Парралелепипед4 и сфера8 - тру - " + intersectionSphereParallelepiped(parallelepiped4, sphere8));
        System.out.println("16. Парралелепипед1 и сфера9 - false - " + intersectionSphereParallelepiped(parallelepiped1, sphere9));
    }

    public static boolean intersectionSphereParallelepiped(Parallelepiped par, Sphere sph) {
        boolean boolCorner = true;
        int minX = Math.min(par.getX1(), par.getX2());
        int maxX = Math.max(par.getX1(), par.getX2());
        int minY = Math.min(par.getY1(), par.getY2());
        int maxY = Math.max(par.getY1(), par.getY2());
        int minZ = Math.min(par.getZ1(), par.getZ2());
        int maxZ = Math.max(par.getZ1(), par.getZ2());
        boolean boolX = (minX - sph.getRadius() <= sph.getX() && sph.getX() <= maxX + sph.getRadius());
        boolean boolY = (minY - sph.getRadius() <= sph.getY() && sph.getY() <= maxY + sph.getRadius());
        boolean boolZ = (minZ - sph.getRadius() <= sph.getZ() && sph.getZ() <= maxZ + sph.getRadius());

        //углы считаем отдельно
        if (boolX && boolY && boolZ) {
            if (minX > sph.getX() && minY > sph.getY() && minZ > sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - minX, 2) + Math.pow(sph.getY() - minY, 2) + Math.pow(sph.getZ() - minZ, 2))) <= sph.getRadius();
            }       //111
            if (minX > sph.getX() && minY > sph.getY() && maxZ < sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - minX, 2) + Math.pow(sph.getY() - minY, 2) + Math.pow(sph.getZ() - maxZ, 2))) <= sph.getRadius();
            }       //112
            if (maxX < sph.getX() && minY > sph.getY() && maxZ < sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - maxX, 2) + Math.pow(sph.getY() - minY, 2) + Math.pow(sph.getZ() - maxZ, 2))) <= sph.getRadius();
            }       //212
            if (maxX < sph.getX() && minY > sph.getY() && minZ > sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - maxX, 2) + Math.pow(sph.getY() - minY, 2) + Math.pow(sph.getZ() - minZ, 2))) <= sph.getRadius();
            }       //211
            if (minX > sph.getX() && maxY < sph.getY() && minZ > sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - minX, 2) + Math.pow(sph.getY() - maxY, 2) + Math.pow(sph.getZ() - minZ, 2))) <= sph.getRadius();
            }       //121
            if (minX > sph.getX() && maxY < sph.getY() && maxZ < sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - minX, 2) + Math.pow(sph.getY() - maxY, 2) + Math.pow(sph.getZ() - maxZ, 2))) <= sph.getRadius();
            }       //122
            if (maxX < sph.getX() && maxY < sph.getY() && minZ > sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - maxX, 2) + Math.pow(sph.getY() - maxY, 2) + Math.pow(sph.getZ() - minZ, 2))) <= sph.getRadius();
            }       //221
            if (maxX < sph.getX() && maxY < sph.getY() && maxZ < sph.getZ()) {
                boolCorner = (Math.sqrt(Math.pow(sph.getX() - maxX, 2) + Math.pow(sph.getY() - maxY, 2) + Math.pow(sph.getZ() - maxZ, 2))) <= sph.getRadius();
            }       //222
        }
        return boolX && boolY && boolZ && boolCorner;
    }
}