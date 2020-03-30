package com.pl3nny.paintJob;

public class PaintJob
{
    public static void main(String[] args) {
        System.out.println("Has 2 extra buckets");
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));

        System.out.println("No extra buckets");
        System.out.println(getBucketCount(3.4, 2.1, 1.5));

        System.out.println("cacl buckets needed with area and area per bucket");
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0)
            return -1;
        double totalArea = (width * height);
        double bucketsNeeded = (totalArea / areaPerBucket);

        bucketsNeeded = bucketsNeeded - (areaPerBucket * (double)extraBuckets);
        if(bucketsNeeded < 0)
            return -1;

        return (int)Math.ceil(bucketsNeeded);
    }
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        double totalArea = (width * height);
        double bucketsNeeded;
        bucketsNeeded = (totalArea / areaPerBucket);

        return (int)Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0)
            return -1;

        double bucketsNeeded;
        bucketsNeeded = (int)Math.ceil((area / areaPerBucket));

        return (int)bucketsNeeded;
    }
}
