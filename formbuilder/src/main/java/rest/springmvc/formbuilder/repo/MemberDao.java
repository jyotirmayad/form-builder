package rest.springmvc.formbuilder.repo;

import java.util.List;

import rest.springmvc.formbuilder.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
