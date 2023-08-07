package com.example.mockitotest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_member_agree")
public class MemberAgree {
    
    @Id
    private Long memberId;
    
    private String emailAgreeYn;
    
    private String smsAgreeYn;
}
