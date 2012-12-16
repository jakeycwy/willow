/**
 * 版权声明：厦门中图壹购信息技术有限公司 版权所有 违者必究 2012 
 * 日    期：12-12-15
 */
package com.willow.platform.codegen;

import org.testng.annotations.Test;

/**
 * <pre>
 *
 * </pre>
 *
 * @author 朱贤俊
 * @version 1.00
 */
public class CodegenManagerTest {
    @Test
    public void generateTest() {
        CodegenManager codegenManager = new CodegenManager();
        String codegenConfigPath = "/com/willow/platform/codegen/DoorCodeGenConfigTest.yml";
        codegenManager.setConfigPath(codegenConfigPath);
        try {
            codegenManager.generate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
