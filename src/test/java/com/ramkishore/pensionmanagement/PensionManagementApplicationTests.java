package com.ramkishore.pensionmanagement;


import com.ramkishore.pensionmanagement.model.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AuthRequestTest.class, BankDetailTest.class, PensionerDetailTest.class,
        PensionerDetailTest.class, ProcessPensionResponseTest.class, ProcessPensionResponseTest.class, TransactionDetailTest.class})
class PensionManagementApplicationTests {


}
