package dev.gotenberg.common.exceptions;

public class PageRangeMalformedException extends ArithmeticException {
    public PageRangeMalformedException() {
        super("negative page ranges are not allowed");
    }
}
