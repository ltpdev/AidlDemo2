// ISecurityCenter.aidl
package com.czy.server.aidldemo2;

// Declare any non-default types here with import statements

interface ISecurityCenter {
    String encrypt(String content);
    String decrypt(String password);
}
