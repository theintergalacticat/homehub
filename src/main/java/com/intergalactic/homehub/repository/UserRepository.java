package com.intergalactic.homehub.repository;

import com.intergalactic.homehub.model.User;

public interface UserRepository
{
	Iterable<User> findAll();

	User save(User user);

	User findUser(Long id);

	void deleteUser(Long id);

}
