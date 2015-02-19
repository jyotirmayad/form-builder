package rest.springmvc.formbuilder.dao;

import java.util.List;

import rest.springmvc.formbuilder.model.User;

public interface MemberDao
{
    public User findById(Long id);

    public User findByEmail(String email);

    public List<User> findAllOrderedByName();

    public void register(User member);
}
