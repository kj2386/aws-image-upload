package tech.alexjohnson.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-image-upload123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
