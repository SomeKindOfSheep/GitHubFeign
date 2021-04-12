package Search.models.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Page {

	@Builder.Default
	private int size = 100;
	@Builder.Default
	private int current = 1;

}
