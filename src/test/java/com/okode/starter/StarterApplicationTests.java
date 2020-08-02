package com.okode.starter;

import com.okode.starter.model.Greeting;
import com.okode.starter.model.Version;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@AutoConfigureWebTestClient
class StarterApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testHello() {
		webTestClient.get().uri("/hello/john")
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.expectStatus().isOk()
				.expectBody(Greeting.class)
				.isEqualTo(new Greeting("Hello, john"));
	}

	@Test
	void testVersion() {
		webTestClient.get().uri("/version")
				.accept(MediaType.APPLICATION_JSON)
				.exchange()
				.expectStatus().isOk()
				.expectBody(Version.class)
				.isEqualTo(new Version());
	}

}
