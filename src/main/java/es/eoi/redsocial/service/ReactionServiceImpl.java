package es.eoi.redsocial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.eoi.redsocial.entity.Reaction;
import es.eoi.redsocial.repository.ReactionRepository;

@Service
public class ReactionServiceImpl implements ReactionService {

	@Autowired
	private ReactionRepository reactionRepository;

	@Override
	@Transactional
	public Reaction saveReaction(Reaction reaction) {

		return reactionRepository.save(reaction);

	}

}
