package org.plantuml.idea.rendering;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.plantuml.idea.plantuml.PlantUml;

import java.io.File;

public class RenderRequest {
    private final File baseDir;
    private final String source;
    private final PlantUml.ImageFormat format;
    private final int page;
    private final int zoom;
    private final Integer version;
    private boolean renderUrlLinks;

    public RenderRequest(File baseDir, String source, PlantUml.ImageFormat format, int page, int zoom, Integer version, boolean renderUrlLinks) {
        this.baseDir = baseDir;
        this.source = source;
        this.format = format;
        this.page = page;
        this.zoom = zoom;
        this.version = version;
        this.renderUrlLinks = renderUrlLinks;
    }

    public RenderRequest(RenderRequest renderRequest, PlantUml.ImageFormat format) {
        this.baseDir = renderRequest.baseDir;
        this.source = renderRequest.source;
        this.format = format;
        this.page = renderRequest.page;
        this.zoom = renderRequest.zoom;
        this.version = null;
    }

    public File getBaseDir() {
        return baseDir;
    }

    public String getSource() {
        return source;
    }

    public PlantUml.ImageFormat getFormat() {
        return format;
    }

    public int getPage() {
        return page;
    }

    public int getZoom() {
        return zoom;
    }

    public Integer getVersion() {
        return version;
    }

    public boolean isRenderUrlLinks() {
        return renderUrlLinks;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("baseDir", baseDir)
                .append("format", format)
                .append("page", page)
                .append("zoom", zoom)
                .append("renderUrlLinks", renderUrlLinks)
                .append("version", version)
                .toString();
    }
}
